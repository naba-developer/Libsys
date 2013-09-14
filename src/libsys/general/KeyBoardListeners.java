package libsys.general;

import libsys.listeners.CalculatorKeyBoardListener;

public class KeyBoardListeners
{
		CalculatorKeyBoardListener calculatorKeyBoardListener;
		LIBSYSSystem LibrarySystem;
		
		public KeyBoardListeners(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				calculatorKeyBoardListener = new CalculatorKeyBoardListener(LibrarySystem);
		}
}
