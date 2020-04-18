package correctabstractfactorypackage;
public class PersonalComputer extends Computer {
	String ram, hdd, cpu;

	public PersonalComputer(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
