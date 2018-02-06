import java.util.Scanner;
public class dataModel
{
    public static void Main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter class name:");
        String className = scan.nextLine();
        System.out.println("Enter data type variable names with comma");
        String input = scan.nextLine();
        String variableList[] = input.split(",");
        String nameList[] = new String[variableList.length];
        String dataList[] = new String[variableList.length];
        for(int i = 0; i<variableList.length; i++){
            variableList[i] = variableList[i].trim();
            int index = variableList[i].indexOf(" ");
            nameList[i] = variableList[i].substring(index+1);
            dataList[i] = variableList[i].substring(0, index);
        }

        System.out.println("public class " + className + "{");
        for(int i = 0; i<variableList.length; i++){
            System.out.println("private " + variableList[i] + ";");
        }

        System.out.println("public " + className + "(){");
        for(int i = 0; i<variableList.length; i++){
            System.out.print(variableList[i]);
            switch(variableList[i].charAt(0)){
                case 'i':
                case 'l':
                case 'f':
                case 'd':
                System.out.println(" = 0;");
                break;
                default:
                case 'S':
                case 's':
                System.out.println(" = \"\";");
                break;
            }
        }
        System.out.println("}");
        
        System.out.print("public " + className + "(");
        for(int i = 0; i<variableList.length; i++){
            System.out.print(variableList[i]);
            if(i<(variableList.length-1))
                System.out.print(", ");
        }
        System.out.println("){");
        for(int i = 0; i<variableList.length; i++){
            System.out.println("this." + nameList[i] + " = " + nameList[i] + ";");
        }
        System.out.println("}");
        
        
        for(int i = 0; i<variableList.length; i++){
            System.out.println("public void set" + capitalizeFirstLetter(nameList[i]) + "(" + variableList[i] + "){");
            System.out.println("this." + nameList[i] + " = " + nameList[i] + ";");
            System.out.println("}");
        } 
        for(int i = 0; i<variableList.length; i++){
            System.out.println("public " + dataList[i] + " get" + capitalizeFirstLetter(nameList[i]) + "(){");
            System.out.println("return " + nameList[i] + ";");
            System.out.println("}");
        }
        System.out.println("}");
    }

    public static String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }
}
