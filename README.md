GitTutorialRepo
===============
Initial push to this repo contained two projects created out of an eclipse workspace.
EJBMDB_Tests and MDBWebClient

The Web Client can be run on a JBOSS server (Run as -> Run on Server).  The src runs on the default JBOSS standalone-full.xml.
You JBOSS Standalone should have these administered objects.  

                    <jms-queue name="MyQueue">
                        <entry name="java:/jms/queue/MyQueue"/>
                        <durable>true</durable>
                    </jms-queue>
                    <jms-queue name="testQueue">
                        <entry name="queue/MyQueue"/>
                    </jms-queue>
                    <jms-topic name="testTopic">
                        <entry name="topic/MyTopic"/>
                    </jms-topic>

Feel free to modify the source code and commit your changes.
Please do not edit the .gitignore file unless you are sure it benefits everyone.

Git Tutorial Repo.