package de.codecentric.jenkins.dashboard.api.environment;

import java.util.List;

import com.amazonaws.regions.Region;

/**
 * Interface for accessing environment information.
 * EC2 instances can be accessed by region name.
 * Additionally we want to be able to get environment
 * information for specific environments that have a tag. 
 * 
 * @author marcel.birkner
 *
 */
public interface EnvironmentInterface {

	public List<ServerEnvironment> getEnvironments(Region region);
	public List<ServerEnvironment> getEnvironmentsByTag(Region region, String tag);
	
}
