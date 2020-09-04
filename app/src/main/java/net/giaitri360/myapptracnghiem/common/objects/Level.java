package net.giaitri360.myapptracnghiem.common.objects;

public enum Level {
    easy(1),medium(2),dificult(3);
   private final int value;
    Level(int value){
        this.value=value;


    }
    public int getValue(){
        return value;

    }
    public static Level getType(int value){
        if(value==1){
            return  easy;

        }
           else  if(value==2){
               return medium;

        }
          else if(value==3){
              return dificult;

        }
          return null;


    }

}
