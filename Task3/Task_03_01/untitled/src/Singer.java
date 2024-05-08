public  abstract class Singer {
    private String name;
    static int numOfSingers;
    private int id;

    public Singer(String name) {
        this.name = name;
        numOfSingers++;
        this.id = numOfSingers;
    }

    public static String loudest(Singer[] arr){
        int id = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].sing().length(); j++) {
                if (Character.isUpperCase(arr[i].sing().charAt(j))){
                    count++;
                }
            }
            if (count > max){
                max = count;
                count = 0;
                id = i;
            }
        }
        return arr[id].sing();
    }

    abstract String sing();

    public String toString(){
        return "(" + id + ") " + name + ": " + sing();
    }

}
