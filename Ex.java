    // error ko catch nahi kar sakte , error ko hum handle nahi kar sakte , but exception ko hum catch and handle kar sakte hai.

class Ex{
    public static void main(String[] args){
        int[] marks = {97,95,99};
        try{
            System.out.println(marks[5]);
        } catch(Exception exception) {
            // do things after catching
        }     
        System.out.println("The Name is Adarsh"); 
    }
}