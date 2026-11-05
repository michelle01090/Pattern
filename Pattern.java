//Class author: Michelle Wei
//10/31/26
//Period 3
//pattern generator

public static void stars(int rows){
int count=0;\String star="*";
while (count<rows){
    System.out.println(star);
    count +=1; 
    star+="**";


}

}
public static void main (String args[]){
   stars(5);
}