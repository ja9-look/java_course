public class House {

        private int numStories;
        private int numWindows;
        private String color;

        public House(int numStories, int numWindows, String color){
            this.numStories = numStories;
            this.numWindows = numWindows;
            this.color = color;
        }

        public int getNumStories(){
            return numStories;
        }

        public void setNumStories(int stories){
            this.numStories = stories;
        }

        public int getNumWindows(){
            return numWindows;
        }

        public void setNumWindows(int windows){
            this.numWindows = windows;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

} // end House