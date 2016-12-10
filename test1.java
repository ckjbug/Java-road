//备忘录模块（Swing+JDBC实现）1
//1.1 绘制艺术字
public void paint（Graphics g）{
super.paitn(g);//调用父类的构造方法
Graphics2D g2 = (Graphics2D) g;//获取Graphics2D对象
Stirng str = "备忘录模块";//设置要显示的文字
Font font = new Font("隶书",Font.BOLD | Font.ITALIC,40);//新建字体
g2.setFont(font);
for(int i = 0; i < str.length; i++){
g2.setColor(Color.GRAY);//设置前景色
g2.drawString(str.charAt(i) + "",50 +　ｉ*ｆont.getSize(),50 + i*font.getSize());//在指定位置绘制文本给。
g2.drowString(str.charAt(i) + "",370　－ i*font.getSize(),50 + i*font.getSize());//在指定的位置绘制文本

}
for(int i = 0; i < str.length();i++)
g2.setColor(Color.MAGENTA);//设置前景色
g2.drawString(str.charAt(i) + "",40  + i*font.getSize(),40 + i*font.getSize());//在指定的位置绘制文本
g2.drawString(str.chatAt(i) + "",360 - i*font.getSize(),40 + i*font.getSize());//在指定的位置绘制文本
}
}
1.2窗体居中显示
public class windowUtil{
public static Dimension getSize(){
return new Dimension(500,309);//将窗体设置成500*309像素
}
//计算窗体居中的显示时左上角的坐标
public static Point getLocation(){
Toolkit toolkit = Toolkit.getDdfaultToolkit();//获取Toolkit实例
Dimension screenSize = toolkit.getScreeSize();
if(screenSize.width < getSize().width) || (screeSize.height < getSize().height)){
JOptionPane.showMessageDialog(null,"显示器的分辨率至少为500*309"，"",JOptionPane.WARNING_MESSAGE);
system.exit(0);//终止程序
}
int x = (screenSize.width - getSize().width) / 2;//计算左上角横坐标
int y = (screeSize.heigth - getSize().height) / 2;//计算左上角纵坐标
return new Point(x,y);
}
}
