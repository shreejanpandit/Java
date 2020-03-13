### Explain commonly used Event Listener interface with it's methods and examples.

> Here some event listener interface which is commonly used like ActionListener,MouseListener,KeyListener,WindowListener,FocusListener

### ActionListener:
The listener interface for receiving action events. The class that is interested in processing an action event implements this interface, and the object created with that class is registered with a component, using the component's addActionListener method. When the action event occurs, that object's actionPerformed method is invoked.

- Methods: **actionPerformed(ActionEvent e)**

### MouseListener:
```public interface MouseListener```

```extends EventListener```

The listener interface for receiving "interesting" mouse events (press, release, click, enter, and exit) on a component. (To track mouse moves and mouse drags, use the MouseMotionListener.)
The class that is interested in processing a mouse event either implements this interface (and all the methods it contains) or extends the abstract MouseAdapter class (overriding only the methods of interest).

The listener object created from that class is then registered with a component using the component's addMouseListener method. A mouse event is generated when the mouse is pressed, released clicked (pressed and released). A mouse event is also generated when the mouse cursor enters or leaves a component. When a mouse event occurs, the relevant method in the listener object is invoked, and the MouseEvent is passed to it.

#### Methods:
- void mouseClicked(MouseEvent e)
- void mousePressed(MouseEvent e)
- void mouseReleased(MouseEvent e)
- void mouseEntered(MouseEvent e)
- void mouseExited(MouseEvent e)

### KeyListener:
```public interface KeyListener```

```extends EventListener```

The listener interface for receiving keyboard events (keystrokes). The class that is interested in processing a keyboard event either implements this interface (and all the methods it contains) or extends the abstract KeyAdapter class (overriding only the methods of interest).
The listener object created from that class is then registered with a component using the component's addKeyListener method. A keyboard event is generated when a key is pressed, released, or typed. The relevant method in the listener object is then invoked, and the KeyEvent is passed to it.

#### Methods:
- void keyTyped(KeyEvent e)
- void keyPressed(KeyEvent e)
- void keyReleased(KeyEvent e)

### WindowListener:
```public interface WindowListener```

```extends EventListener```

The listener interface for receiving window events. The class that is interested in processing a window event either implements this interface (and all the methods it contains) or extends the abstract WindowAdapter class (overriding only the methods of interest). The listener object created from that class is then registered with a Window using the window's addWindowListener method. When the window's status changes by virtue of being opened, closed, activated or deactivated, iconified or deiconified, the relevant method in the listener object is invoked, and the WindowEvent is passed to it.

- void windowOpened(WindowEvent e)
- void windowClosing(WindowEvent e)
- void windowClosed(WindowEvent e)
- void windowIconified(WindowEvent e)
- void windowDeiconified(WindowEvent e)
- void windowActivated(WindowEvent e)
- void windowDeactivated(WindowEvent e)

### FocusListener:
```public interface FocusListener```

```extends EventListener```

The listener interface for receiving keyboard focus events on a component. The class that is interested in processing a focus event either implements this interface (and all the methods it contains) or extends the abstract FocusAdapter class (overriding only the methods of interest). The listener object created from that class is then registered with a component using the component's addFocusListener method. When the component gains or loses the keyboard focus, the relevant method in the listener object is invoked, and the FocusEvent is passed to it.

#### Method:
- void focusGained(FocusEvent e)
- void focusLost(FocusEvent e)
