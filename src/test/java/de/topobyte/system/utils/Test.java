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

public class Test
{

	public static void main(String[] args)
	{
		print(SystemProperties.JAVA_VERSION);
		print(SystemProperties.JAVA_VENDOR);
		print(SystemProperties.JAVA_VENDOR_URL);
		print(SystemProperties.JAVA_HOME);
		print(SystemProperties.JAVA_CLASS_VERSION);
		print(SystemProperties.JAVA_CLASS_PATH);
		print(SystemProperties.OS_NAME);
		print(SystemProperties.OS_ARCH);
		print(SystemProperties.OS_VERSION);
		print(SystemProperties.FILE_SEPARATOR);
		print(SystemProperties.PATH_SEPARATOR);
		print(SystemProperties.LINE_SEPARATOR);
		print(SystemProperties.USER_NAME);
		print(SystemProperties.USER_HOME);
		print(SystemProperties.USER_DIR);
	}

	private static void print(String propertyName)
	{
		System.out.println(String.format("%s: '%s'", propertyName,
				System.getProperty(propertyName)));
	}

}
