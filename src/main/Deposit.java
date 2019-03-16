package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//
//основной класс для работы с депозитом
//
public class Deposit {
	double deposit; //сумма
	int year;
	int month;
	int day;
	int term; //срок
	double interest; //процентная ставка
	boolean capitaliz; //капитализация
	int proc; //0 - помесячный забор, 1 - через 3 месяца, 2 - в конце срока
	String[][] table; //таблица с датой, процентами и остатком
	
	private LocalDate _startdate; //начальная дата
	private LocalDate _stopdate; //конечная
	private int _periods; //кол-во месяцев (проценты добавляются помесячно)
	double finalproc=0; //итоговые проценты
	
	private void DayInPeriod()//считаем время от вложения вклада до забора
	{
		_startdate = LocalDate.of(year, month, day); //конвертируем дату из формата ввода в удобный
		_stopdate = _startdate; 
		_stopdate = _stopdate.plusDays(term);//начальная дата + срок = финальная дата
		Period period = Period.between(_startdate, _stopdate);
		_periods = 0; //на всякий случай
		_periods += period.getYears()*12; //добавляем года, т.к месяцы ниже не могут быть выше 12 (почему то)
		_periods += period.getMonths()+1;//считаем месяцы (TODO: возможно заменить на выборочный период)
	}
	
	public void Calculate()
	{
		if (capitaliz)
		{}
		else
		{SimpleInterest();}//если не капитализация, то это простые проценты
	}
	
	public void SimpleInterest()//простые проценты, для них выдача/невыдача денег не важна, так что proc игнорируется
	{
		DayInPeriod();//подсчёт срока
		table = new String[_periods][3]; //инициализация таблицы
		
		for(int i=0; i<_periods;i++) //добавление процентов каждый период
		{
			
			//double money = deposit*((interest/100)/12);
			double money = deposit*((interest/100)*((double)_startdate.lengthOfMonth()/_startdate.lengthOfYear())); //подневный расчет
			finalproc += money; //финальные проценты - сумма всех процентов
			_startdate = _startdate.plusMonths(1);//добавление месяца
			table[i][0]=_startdate.format(DateTimeFormatter.ofPattern("d/MM/YY"));//форматированный вывод даты в первую колонку
			table[i][1]=String.format("%.2f",money); //формат до 2х знаков после запятой
			table[i][2]=String.format("%.2f",deposit);
			
		}
	}
	public static void HardInterest()
	{
		
	}
}
