package Nov3;

class MyString
{
        private char[] letters;
        
        public MyString( String other )
        {       // MUST BE DEEP COPY: USE REAL STRING'S BUILT IN METHOD 
                // TO RETURN A DEEP COPY OF THE THE UNDERLYING CHAR ARRAY
        	letters = other.toCharArray();
        }
        public MyString( MyString other )
        {       // RE-USE THE ABOVE CONSTRUCTOR.
                // LIKE FRACTION CONSTRUCTORS - RE-USED THE FULL CONSTRUCTOR
        	letters = new char[other.letters.length];
        	for(int i=0;i<other.letters.length;i++){
        		letters[i]=other.letters[i];
        	}
        }       
        public int length()
        {
                return letters.length;
        }
        public char charAt(int index) // IF INDEX OUT OF BOUNDS. EXIT PROGRAM! (dont return the null char)
        {
        		if(index>=letters.length){
        			System.exit(0);
        		}
                return letters[index]; // THE null CHAR JUST TO MAKE It COMPILE
        }
        int compareTo(MyString other)
        {
        	if(new String(letters).compareTo(new String(other.letters))<0)
                return -1;
        	if(new String(letters).compareTo(new String(other.letters))>0)
                return 1;
        	return 0;
        }       
        public boolean equals(MyString other)
        {
                return compareTo(other)==0;
        }
        // LOOKING for c but starting at [startIndex],  not at [0]
        // You should use this in your other Indexof Method
        public int indexOf(int startIndex, char ch)     
        {
               for(int i=startIndex+1;i<letters.length;i++){
            	   if(letters[i]==ch)
            		   return i;
               }
               return -1;
        }
        public int indexOf(MyString other)
        {       
        	int start=0,index=0;
        	for(int i=0;i<other.length();i++)
        	{
        		if(i==0)
        		start=indexOf(-1,other.letters[i]);
        		if(index!=-1)
        			index=indexOf(index,other.letters[i]);
        		else
        			index=indexOf(0,other.letters[i]);
        		
        	}
        	if(index-start==other.length()-1)
        		return start;
        	return -1;
        }
        public String toString()
        {
                return new String(letters);
        }
}
public  class MyStringTester
{
        public static void main( String[] args )
        {
                MyString s1 = new MyString("Hello World");
                System.out.println( "s1=" + s1 );
                
                MyString s2 = new MyString(s1);
                System.out.println( "s2=" + s2 );
                
                if ( s1.equals( s2 ) )
                        System.out.println( s1 + " identical to " + s2 );
                else
                        System.out.println( s1 + " not identical to " + s2 );
                
                MyString s3 = new MyString( "GoodBye World" );
                System.out.println( "s3='" + s3 + "' and its length is: " + s3.length() );
                
                if ( s1.equals( s3 ) )
                        System.out.println( s2 + " identical to " + s3 );
                else
                        System.out.println( s1 + " not identical to " + s3 );
                
                s1=new MyString("albert"); s2=new MyString("alpha");
                System.out.println( "s1=" + s1 + "\ns2=" + s2 );
                System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "albert"  < "alpha" returns -1
                
                s1=new MyString("zebrano"); s2=new MyString("zebra");
                System.out.println( "s1=" + s1 + "\ns2=" + s2 );
                System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "zebrano"  > "zebra" returns 1         
                
                s1=new MyString("cattle"); s2=new MyString("catty");
                System.out.println( "s1=" + s1 + "\ns2=" + s2 );
                System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // since "cattle"  < "cattle" returns 1                 
                
                s1=new MyString("pneumoencephalographically"); s2=new MyString("pneumoencephalographically");
                System.out.println( "s1=" + s1 + "\ns2=" + s2 );
                System.out.println( "s1.compareTo(s2) ==> " + s1.compareTo(s2) ); // returns 0 they are same string value
                
                System.out.println( "[4]'th letter of " + s3 + " is " + s3.charAt(4) );
                        
                MyString key = new MyString("rld");
                System.out.println( key + " found in " + s3 + " at index: " + s3.indexOf( key ) );
                // SAME THING BUT WITHOUT USING A MyString VAR FOR THE KEY
                System.out.println( new MyString("Goo") + " found in " + s3 + " at index: " + s3.indexOf( new MyString("Goo") ) );
                System.out.println( new MyString("Bye") + " found in " + s3 + " at index: " + s3.indexOf( new MyString("Bye") ) );
                System.out.println( new MyString("zorp") + " found in " + s3 + " at index: " + s3.indexOf( new MyString("zorp") ) );
        }

}