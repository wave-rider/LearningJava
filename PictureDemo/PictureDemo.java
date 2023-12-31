public class PictureDemo
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      System.out.println("Working Directory = " + System.getProperty("user.dir"));
      pic.load("PictureDemo/queen-mary.png");
   }
}

