package shared.model.items;

import shared.definitions.DevCardType;

public class DevelopmentCard {
	
	private DevCardType devCardType;
	private boolean hasBeenPlayed;

	public DevelopmentCard() {}

	public DevCardType getDevCardType() {
		return devCardType;
	}

	public void setDevCardType(DevCardType devCardType) {
		this.devCardType = devCardType;
	}

	public boolean isHasBeenPlayed() {
		return hasBeenPlayed;
	}

	public void setHasBeenPlayed(boolean hasBeenPlayed) {
		this.hasBeenPlayed = hasBeenPlayed;
	}
	
}
