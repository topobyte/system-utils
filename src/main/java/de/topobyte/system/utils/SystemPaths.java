// Copyright 2016 Sebastian Kuerten
//
// This file is part of system-utils.
//
// system-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// system-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with system-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.system.utils;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class provides helpers to access the paths defined through system
 * properties conveniently.
 */
public class SystemPaths
{

	/**
	 * String value of the 'user.home' system property
	 */
	public static final String STRING_HOME = System
			.getProperty(SystemProperties.USER_HOME);

	/**
	 * String value of the 'user.dir' system property
	 */
	public static final String STRING_CWD = System
			.getProperty(SystemProperties.USER_DIR);

	/**
	 * The value of the 'user.home' system property converted to a {@link Path}
	 * instance.
	 */
	public static final Path HOME = Paths.get(STRING_HOME);

	/**
	 * The value of the 'user.dir' system property converted to a {@link Path}
	 * instance.
	 */
	public static final Path CWD = Paths.get(STRING_CWD);

}
