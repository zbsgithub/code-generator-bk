package org.keyia.util;

import java.io.File;

import org.apache.tools.ant.BuildException;

import org.apache.tools.ant.DefaultLogger;

import org.apache.tools.ant.Project;

import org.apache.tools.ant.ProjectHelper;

public class ANTManager {

	public static boolean run(String Path, String task) {

		File buildFile = new File(Path);

		// ����һ��ANT��Ŀ

		Project p = new Project();

		// ����һ��Ĭ�ϵļ�����,������Ŀ���������е���־����

		DefaultLogger consoleLogger = new DefaultLogger();

		consoleLogger.setErrorPrintStream(System.err);

		consoleLogger.setOutputPrintStream(System.out);

		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);

		p.addBuildListener(consoleLogger);

		try {

			p.fireBuildStarted();

			// ��ʼ������Ŀ

			p.init();

			ProjectHelper helper = ProjectHelper.getProjectHelper();

			// ������Ŀ�Ĺ����ļ�

			helper.parse(p, buildFile);

			// ִ����Ŀ��ĳһ��Ŀ��

			p.executeTarget(task);

			p.fireBuildFinished(null);

		} catch (BuildException be) {

			p.fireBuildFinished(be);
			return false;

		}
		return true;

	}
	public static void main(String[] args) {

		ANTManager.run("G:\\Programing\\eclipse-SDK-3.5.2-win32\\workspace\\build.xml"
				,"rebuild");
	}

}
