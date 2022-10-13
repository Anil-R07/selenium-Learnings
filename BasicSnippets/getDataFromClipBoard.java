//The snippet allows you to copy data from clipboard, can be used to get data from textBox when getAttribute() or getText() isn't working

/**
*
* Get the copied data from the clipboard
*
*/


public void getDataFromClipBoard(){
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	Transferable contents = clipboard.getContents(null);
	String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
	System.out.println(x);
}
