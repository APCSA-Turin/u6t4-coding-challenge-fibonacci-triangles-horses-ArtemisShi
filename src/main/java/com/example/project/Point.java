package com.example.project;
    public class Point {
        private int x;
        private int y;
       
        public Point(int x, int y) {
          this.x = x;
          this.y = y;
        }
       
        // Returns distance between this Point object and another Point object
        public double distanceTo(Point other) {
            //distance formula= d=Radical (x1-x2)^2+(y1-y2)^2
            double xP =Math.pow(x-other.getX(),2);
           double yP=Math.pow(y-other.getY(),2);
          return Math.sqrt(xP+yP);
        }
     
        // Returns a string in the format: (x, y)
        public String pointInfo() {
         return "(" + getX()+", "+getY()+")";
        }

        //setter method
        public void add(int incre){
          x+=incre;
          y+=incre;
        }

      //getter method
      public int getX(){
        return x;
      }
      public int getY(){
        return y;
      }
    }

