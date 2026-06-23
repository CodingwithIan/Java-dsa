
static void bubbleSort(int[] marks,int length){

    for (int i=0;i<length-1;i++){
        for (int j=0;j<i-1;j++){
            if (marks[j]>marks[j+1]){
                int temp;
                temp=marks[j];
                marks[j]=marks[j+1];
                marks[j+1]=temp;
            }
        }
    }


}
public static void main(String[] args){
    int[] marks={2,6,7,3,9,1,4,8,5};
    int length=marks.length;
    bubbleSort(marks,length);
    for (int x=0;x<length;x++){
        System.out.print(marks[x]+" ");
    }

}
