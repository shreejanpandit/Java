### Explain various event object with its consturctor, methods and example.

| Event Classes	 | Listener Interfaces|
| --------------|------------------- |
| ```ActionEvent``` | ```ActionListener``` |
| ```MouseEvent``` | ```MouseListener and MouseMotionListener``` |
| ```MouseWheelEvent``` | ```MouseWheelListener``` |
| ```KeyEvent``` | ```KeyListener``` |
| ```ItemEvent``` |```KeyListener``` |
| ```TextEvent``` | ```TextListener``` |
| ```AdjustmentEvent``` | ```AdjustmentListener``` |
| ```WindowEvent``` | ```WindowListener``` |
| ```ComponentEvent``` | ```ComponentListener``` |
| ```ContainerEvent``` | ```ContainerListener``` |
| ```ContainerEvent``` | ```ContainerListener``` |
| ```FocusEvent``` | ```FocusListener``` |

## ActionEvent:

### Methods:
- actionPerformed(ActionEvent e)

## MouseEvent:

### Methods:
- void mouseClicked(MouseEvent e)
- void mousePressed(MouseEvent e)
- void mouseReleased(MouseEvent e)
- void mouseEntered(MouseEvent e)
- void mouseExited(MouseEvent e)

## KeyEvent:

### Methods
- void keyTyped(KeyEvent e)
- void keyPressed(KeyEvent e)
- void keyReleased(KeyEvent e)


## WindowEvent:

### Methods:
- void windowOpened(WindowEvent e)
- void windowClosing(WindowEvent e)
- void windowClosed(WindowEvent e)
- void windowIconified(WindowEvent e)
- void windowDeiconified(WindowEvent e)
- void windowActivated(WindowEvent e)
- void windowDeactivated(WindowEvent e)