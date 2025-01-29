
class StringManipulation {

  public static void main(String[] args){

    String str = "The rains has started here";
    String str1 = "The rains Has started here";

    System.out.println(str.length());
    System.out.println(str.charAt(5));
    System.out.println(str.indexOf("s")); // first occurance
    System.out.println(str.indexOf('s', str.indexOf("s"))+1); //second occurance
    System.out.println(str.indexOf("has"));
    System.out.println(str.indexOf("hello"));

    // String comparison
    System.out.println(str.equals(str1));
    System.out.println(str.equalsIgnoreCase(str1));
    // sub-string
    System.out.println(str.substring(0,8));

    //trimming data... 
    String data = "  Hello Word ";
    System.out.println(data.trim());
    System.out.println(data.replace(" ", "")); // replace

    // date
    String date = "20-09-2024";
    System.out.println(date.replace("-","/"));

    //Split 
    String splitData = "Bro_Frank_Mambo_Vipi";
    String splitedData[] = splitData.split("_");
    for(int i=0; i<splitedData.length;i++){
      System.out.println(splitedData[i]);
    }

    //Concatenation. 
    String s2 = "Hello Mkuu ";
    System.out.println(s2.concat("Wangu"));
    


  }
  
}
