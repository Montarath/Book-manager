import javax.swing.*;

public class PersonalLibrary {
    public static void main(String[] args) {
        String book= JOptionPane.showInputDialog("What genre is your book?(mystery, horror, fantasy or sci-fi)");
            if (book.equalsIgnoreCase("mystery")) {
                Mystery mystery=new Mystery(JOptionPane.showInputDialog("How is your book called?"),JOptionPane.showInputDialog("Who is the author of your book?"),Integer.parseInt(JOptionPane.showInputDialog("What is the length of your book (nº of pages)")));
                System.out.println(mystery);
            }
            else if (book.equalsIgnoreCase("horror")) {
                Horror horror=new Horror(JOptionPane.showInputDialog("How is your book called?"),JOptionPane.showInputDialog("Who is the author of your book?"),Integer.parseInt(JOptionPane.showInputDialog("What is the length of your book (nº of pages)")));
                System.out.println(horror);
            }
            else if (book.equalsIgnoreCase("fantasy")) {
                Fantasy fantasy=new Fantasy(JOptionPane.showInputDialog("How is your book called?"),JOptionPane.showInputDialog("Who is the author of your book?"),Integer.parseInt(JOptionPane.showInputDialog("What is the length of your book (nº of pages)")));
                System.out.println(fantasy);
            }
            else if (book.equalsIgnoreCase("sci-fi")) {
                SciFi sciFi=new SciFi(JOptionPane.showInputDialog("How is your book called?"),JOptionPane.showInputDialog("Who is the author of your book?"),Integer.parseInt(JOptionPane.showInputDialog("What is the length of your book (nº of pages)")));
                System.out.println(sciFi);
            }
            else System.out.println("That's not a valid book genre");
    }
}