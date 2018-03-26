import java.util.*;
public class OfflineOrderTemplate extends OrderProcessingTemplate {

	Cycle c_menu = new Cycle();
	Scanner sc = new Scanner(System.in);
	@Override
	ItemTemplate selectItem() {
		c_menu.displayMenu();
		System.out.println("enter 1/2/3/4");
		int ch = Integer.parseInt(sc.next());
		ItemTemplate i1;
		if(ch>=1&&ch<=4)
		{
			i1 = c_menu.al.get((ch-1));
			return i1;

		}
		else
		{
			System.out.println("item does not exist!");
			return null;
		}

	}

	@Override
	String doPayment(ItemTemplate item) {
		System.out.println("you have purchased: "+item.name);
		System.out.println("Amount to be paid: "+item.price+"Enter \n1.Cash\2.Swipe Card");
		int ch = Integer.parseInt(sc.next());
		switch(ch)
		{
		case 1:cash();
		break;
		case 2:swipeCard();
		break;
		}
		
		return "Thanks for Shopping!!";
	}

	@Override
	void doDelivery() {
		System.out.println("Collect your item and pay at the counter");
			
	}
	
	void cash()
	{
		System.out.println("You have selected cash as mode of payment");
		
	}
	void swipeCard()
	{
		System.out.println("You have decide to pay using Swipe Card");
		
	}

}
