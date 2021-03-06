package GUI;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main{
    public static MainFrame frame;

    public static void connect(Packet p){
        try{
            Socket socket = new Socket("127.0.0.1",2001);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            if(p.getCode().equals("Add")){
                oos.writeObject(p);
            }
            else if(p.getCode().equals("List")){
                oos.writeObject(p);
                Male FromServer = (Male) ois.readObject();
                ArrayList <Male> ArrayListFromServer = FromServer.getMales();

                String s = "";
                for(int i=0;i<ArrayListFromServer.size();i++){
                    s+=ArrayListFromServer.get(i)+"\n";
                }
                Result.tarea.append(s);
            }
            oos.close();
            ois.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Male maless[] = new Male[100];
    public static int count = 0;
    public static void addMale (Male m){
        maless[count] = m;
        count++;
    }
//
//    public static Medicine2 med[] = new Medicine2[100];
//    public static int count1 = 0;
//    public static void addMedicine2 (Medicine2 md){
//        med[count] = md;
//        count++;
//    }

    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
    }
}