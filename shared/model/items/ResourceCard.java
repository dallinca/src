package shared.model.items;

import shared.definitions.ResourceType;

public class ResourceCard {
	
	private ResourceType resourceType;
	
	public ResourceCard() {}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
}
