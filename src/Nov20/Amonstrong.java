package Nov20;

import java.awt.*;

import java.applet.Applet;

import java.awt.event.*;

public class Amonstrong extends Applet implements ActionListener {

    Label enterLabel = new Label("Enter a sentence...", Label.LEFT);

    TextField enterField = new TextField(60);

    Button goButton = new Button("Is it a amostrong?");

  

    String Sentence, cleanSentence;

    boolean valid = false;

    public void init() { makeGUI(); }

    public void paint( Graphics g ) {

        int x = 20, y = 20;

        if (valid) {

            g.drawString("Sentence = " + Sentence, x, y+= 20);

            g.drawString("Clean Sentence = " + cleanSentence, x, y+= 20);

            if (isAmstrong(enterField.getText()))

g.drawString("It is a amstrong!", x, y+= 20);

            else

g.drawString("It is not a amstrong.", x, y+=20);

            }

    }

    public boolean isAmstrong(String s) {

    	int num=0;
    	try{
    		num=Integer.parseInt(s);
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	int tem=num,res=1;
    	while(tem>0){
    		int d=tem%10;
    		res=res+(d*d*d);
    	}
    	
        return res==num;

    }

    public void processSentence() {

        Sentence = enterField.getText();

  

        cleanSentence = Sentence.toLowerCase();

  

        char [ ] cs = cleanSentence.toCharArray();

        int L = cs.length;

       for (int i=0; i < L; i++) {

  

           if (!isAlpha(cs[i])) {

for (int j=i+1; j < L; j++)

    cs[j-1] = cs[j];

L--; i--;

           }

       }

        cleanSentence = new String(cs, 0, L);

        valid = true;

    }

    boolean isAlpha(char c) {

        return (c >= 'a' && c <= 'z');

    }

    public void actionPerformed(ActionEvent e) {

        repaint();

    }

    public void makeGUI() {

        Panel p = new Panel();

        p.setLayout(new GridLayout(3,1));

        p.add(enterLabel);

        Panel ePanel = new Panel();

        ePanel.add(enterField);

        p.add(ePanel);

        Panel bPanel = new Panel();

        bPanel.add(goButton);

        p.add(bPanel);

        p.setBackground(Color.cyan);

  

        this.setLayout(new BorderLayout());

        this.add(p, "South");

        goButton.addActionListener(this);

    }

}