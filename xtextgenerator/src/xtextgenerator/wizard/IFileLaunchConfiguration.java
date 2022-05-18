package xtextgenerator.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.internal.core.LaunchConfiguration;

public class IFileLaunchConfiguration extends LaunchConfiguration{

	public IFileLaunchConfiguration(IFile file) {
		super(file);
	}
}
