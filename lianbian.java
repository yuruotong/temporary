package text1_java;
import java.io.*;  
public class lianbian {
         public static void main(String[] args){
          Remove a=new Remove("C:\\Users\\MyPC\\Desktop\\","C:\\Users\\MyPC\\Desktop\\��ʱ�ļ�\\","docx");
          
         
         
         }
}
class Remove{
	Remove(String oldPath,String newPath,String fileType){
		 File oldFile = new File(oldPath);
    	 if(!oldFile.exists())System.out.println("û���ҵ�ԭ�ƶ����ļ�");
    	 File[]  fList=oldFile.listFiles();  
        
         /*����*/  
         for(int i=0;i<fList.length;i++)  
          {  
             /*�����ļ���ָ���ĺ�׺ʱ���*/  
           //  if(fList[i].isFile()&&fList[i].getName().endsWith(fileType)) 
        	 if(!fList[i].getName().equals("һ������.jar")&&!fList[i].getName().equals("����վ")&&!fList[i].getName().equals("��ʱ�ļ�")) 
        	 
              {  
            	 	//newһ�����ļ���
             	File fnewpath = new File(newPath);
             	//�ж��ļ����Ƿ����
             	if(!fnewpath.exists())	fnewpath.mkdirs();
             	//���ļ��Ƶ����ļ���
             	File fnew = new File(newPath +fList[i].getName());
             	fList[i].renameTo(fnew);
             	System.out.println(fList[i].getName());

              }  
          }  
        }
   
	

}