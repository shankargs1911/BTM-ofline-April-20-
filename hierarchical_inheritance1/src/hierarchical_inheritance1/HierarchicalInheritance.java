package hierarchical_inheritance1;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Theatre1Kgf theatre1Kgf =new Theatre1Kgf();
		Theatre2Kgf theatre2Kgf = new Theatre2Kgf();
		Theatre3Kgf theatre3Kgf = new Theatre3Kgf();
	Movie movie =new Movie();
	
	theatre1Kgf.TheatreName="Gopalanmall";
	theatre1Kgf.Place ="BNG";
	theatre2Kgf.OrionMall();
	theatre3Kgf.PVRCinemasKoramangala();
	
	
	System.out.println("TheatreName : +theatre1Kgf.TheatreName ");
	System.out.println("Place : +theatre1Kgf.TheatreName ");
	theatre1Kgf.Gopalanmall();
	theatre2Kgf.OrionMall();
	theatre3Kgf.PVRCinemasKoramangala();
		
	}

}
