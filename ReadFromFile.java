import java.io.*;
class ReadFromFile{
  public static void main(String[] args){
    try{
    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
int a = Integer.parseInt(br.readLine());
int b = Integer.parseInt(br.readLine());
    } catch(Exception e){
      System.out.println(e);     
    }
  }
}
