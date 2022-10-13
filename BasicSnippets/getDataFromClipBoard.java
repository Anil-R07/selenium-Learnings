//The snippet allows you to copy data from clipboard, can be used to get data from textBox when getAttribute() or getText() isn't working

public void getDataFromClipBoard(){
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	Transferable contents = clipboard.getContents(null);
	String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
	System.out.println(x);
}