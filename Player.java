package strategydesignpattern;

public abstract class Player {
	protected String name;
	private Boolean defense;
	protected DefenseBehavior defensebehavior;
	protected OffenceBehavior offensebehavior;
	Player(String name)
	{
		this.name = name;
		setDefenseBehavior();
		setOffenseBehavior();
		this.defense = false;
	 }
	public void setDefenseBehavior()
	{
	}
	public void setOffenseBehavior()
	{
	}
	public String play()
	{
		if (this.defense)
		{
			if (defensebehavior == null)
			{
				return "not playing";
			}
			return defensebehavior.play();
		}
		else
		{
			if (offensebehavior == null)
			{
				return "not playing";
			}
			return offensebehavior.play();
		}

	}
	public void turnover()
	{
		defense=true;
	}
}
