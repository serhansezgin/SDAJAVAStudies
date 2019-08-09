package studiesyb;

public class ForLoop {
    public static void main(String[] args) {
/*
        int i;
        for (i=0;i<10;i++){
            System.out.println("i = " + i);
        }
*/
        //int i;
        //int j;
/*
        for (i=0,j=0;i<10 || j<5;i++,j++){
            System.out.println("i = " + i + " j = " + j);
        }
*/
/*
for(int i = 0;i<5;i++){
    for (int j = 0;j<5;j++){
        System.out.println("i = " + i + " j =  " + j);
    }
}
*/

int i = 0;
int j = 0;

while (i<5){
    j=0;
    while (j<5){
        System.out.println("i = " + i + " j = " + j);
        j++;
    }
    i++;
}





    }
}
