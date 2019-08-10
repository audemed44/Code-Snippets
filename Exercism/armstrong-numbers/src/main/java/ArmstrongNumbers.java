class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int rem = 0, count=0, sum = 0, temp = numberToCheck;
		//throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		while (temp != 0)
		{
			temp = temp/10;
			count++;
		}
		temp = numberToCheck;
		while (temp != 0)
		{
			rem = temp%10;
			sum += Math.pow(rem,count);
			temp = temp/10;
		}
		if (sum == numberToCheck)
			return true;
		return false;
	}

}
