package _04_knock_knock;
import javax.swing.JOptionPane;
public class KnockKnock {
	public static void main(String[] args) throws Exception{
JOptionPane.showInputDialog("Tell me a knock knock joke!");
String joke = JOptionPane.showInputDialog("Who's there?");
JOptionPane.showInputDialog(joke + " who?");
JOptionPane.showMessageDialog(null, "That joke was kinda lame");

	}
}