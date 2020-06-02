package Listener_layer;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.*;

public class IReporter_listener1 implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        IResultMap passedmap=null;
        IResultMap failedmap=null;
        IResultMap skippedmap=null;
        Collection<ITestNGMethod> priority1grp=null;
        Collection<ITestNGMethod> priority2grp=null;
        System.out.println("*****customized report");
        for(ISuite Suite:suites)
        {
          Map<String,Collection<ITestNGMethod>> methodsbygroups= Suite.getMethodsByGroups();
           priority1grp=  methodsbygroups.get("priority1");
            priority2grp=  methodsbygroups.get("priority2");
           Collection<ISuiteResult> results= Suite.getResults().values();
           for(ISuiteResult result:results)
           {
               ITestContext resulttype= result.getTestContext();
              passedmap= resulttype.getPassedTests();
                failedmap= resulttype.getFailedTests();
                skippedmap=resulttype.getSkippedTests();

           }
        }

        System.out.println("Passed Test cases for priority1");
        for( ITestNGMethod gr1testcases:priority1grp)
        {
            Set<ITestResult> passedresults= passedmap.getResults(gr1testcases);
            for(ITestResult passedresult:passedresults)
            {
                System.out.println("Testcase passed in grp1: " +passedresult.getName() +" Time taken  :"+(passedresult.getEndMillis()-passedresult.getStartMillis()));
            }

        }
        System.out.println("Passed  Test cases for priority2");
        for( ITestNGMethod gr2testcases:priority2grp)
        {
            Set<ITestResult> passedresults= passedmap.getResults(gr2testcases);
            for(ITestResult passedresult:passedresults)
            {
                System.out.println("Testcase passed in grp2: " +passedresult.getName() +" Time taken  :"+(passedresult.getEndMillis()-passedresult.getStartMillis()));
            }

        }
        System.out.println("****End of report****");


    }
}
