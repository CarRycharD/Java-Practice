
public class TicketPriceCalculation {

	static final int tier_1 = 1000;
	static final int tier_2 = 2500;
	static final int tier_3 = 3500;
	static final int vip = 10000;

	public static void main(String[] args) {

		TicketCategory category = TicketCategory.VIP;
		int cost = 0;
		System.out.println(category);

		switch (category) {
		default:
			cost = 0;
			break;
		case TIER_1:
			cost = tier_1;
			break;
		case TIER_2:
			cost = tier_2;
			break;
		case TIER_3:
			cost = tier_3;
			break;
		case VIP:
			cost = vip;
			break;
		}

		int tickets = 5;

		int price = tickets * cost;

		System.out.println(price);

	}

}
