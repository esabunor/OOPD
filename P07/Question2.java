public static char grade(int mark)
{
	switch(mark / 10)
	{
		case 10:
			grade = 'N':
			break;
		case 9: case 8:
			grade = 'H';	
			break;
		case 7:
			grade = 'D';	
			break;
		case 6:
			grade = 'C';	
			break;
		case 5:
			grade = 'P';
			break;		
		case 4: case 3: case 2: case 1: case 0:
			grade = 'N';
			break;
		default:
			grade = 'N';
	}
	return grade;
}

