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

/**
 * This class provides access to the Strings that can be used to retrieve the
 * standard system properties using {@link System#getProperty(String)}.
 */
public class SystemProperties
{

	/**
	 * Java version code (e.g. '1.7.0_91')
	 */
	public static final String JAVA_VERSION = "java.version";

	/**
	 * JVM vendor string (e.g. 'Oracle Corporation')
	 */
	public static final String JAVA_VENDOR = "java.vendor";

	/**
	 * JVM vendor URL (e.g. 'http://java.oracle.com/')
	 */
	public static final String JAVA_VENDOR_URL = "java.vendor.url";

	/**
	 * Java installation directory (e.g.
	 * '/usr/lib/jvm/java-7-openjdk-amd64/jre')
	 */
	public static final String JAVA_HOME = "java.home";

	/**
	 * Java class version code (e.g. 51.0)
	 */
	public static final String JAVA_CLASS_VERSION = "java.class.version";

	/**
	 * Java classpath (e.g. 'bin:a.jar:b.jar')
	 */
	public static final String JAVA_CLASS_PATH = "java.class.path";

	/**
	 * Operating System Name (e.g. 'Linux')
	 */
	public static final String OS_NAME = "os.name";

	/**
	 * Operating System Architecture (e.g. 'amd64')
	 */
	public static final String OS_ARCH = "os.arch";

	/**
	 * Operating System Version (e.g. '3.13.0-24-generic')
	 */
	public static final String OS_VERSION = "os.version";

	/**
	 * File separator (e.g. '/')
	 */
	public static final String FILE_SEPARATOR = "file.separator";

	/**
	 * Path separator (e.g. ':')
	 */
	public static final String PATH_SEPARATOR = "path.separator";

	/**
	 * Line separator (e.g. '\n')
	 */
	public static final String LINE_SEPARATOR = "line.separator";

	/**
	 * User account name (e.g. 'bob')
	 */
	public static final String USER_NAME = "user.name";

	/**
	 * User home directory (e.g. '/home/bob')
	 */
	public static final String USER_HOME = "user.home";

	/**
	 * Current working directory (e.g. '/foo/bar')
	 */
	public static final String USER_DIR = "user.dir";

}
