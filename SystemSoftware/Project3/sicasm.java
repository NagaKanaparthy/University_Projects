import java.io.*;
import java.util.*;

public class sicasm{
    public static void main(String[] args){
    	//Parse SICOPS file into memory to load instructions
    	//Create empty table for calculating opcodes and addresses
        //
    }
    class symTable{
    	public static int numRows;
        public static int[] relativeAddresses;
		public static int[] absoluteAddresses;
        public static String[] opCode;
        public static String[] lables;
        public static Mnemonic[] operator;
        public static char[] extendedIndicator;
        public static char[] addressingFlags;
        public static String[] operand;
        public static String[] comments;
        public static String[] useStatments;
        public static String[] cSectStatments;
        symTable(int size){
            numRows = size;
            relativeAddresses = new int[size];
            absoluteAddresses = new int[size];
            opCode = new String[size];
            lables = new String[size];
            operator = new Mnemonic[size];
            extendedIndicator = new char[size];
            addressingFlags = new char[size];
            operand = new String[size];
            comments = new String[size];
            useStatments = new String[size];
            cSectStatments = new String[size];
        }
        public static void LoadData(String data){
            InputStream is = new ByteArrayInputStream(data.getBytes());
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            String line;
            for(int i = 0; i < numRows;i++){
                line = bf.readLine();
                lables[i] = line
            }
        }
    }
    class Mnemonic{
        public String instructionName;
        // in decimal format since Java has more support than hex ints.
        public int opCodeValue;
        public int bytesNeeded;
        //I do not know what is this value for now
        public int unknown;
    }
}
