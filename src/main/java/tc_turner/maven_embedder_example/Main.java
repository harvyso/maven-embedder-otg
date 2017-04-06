package tc_turner.maven_embedder_example;

import org.apache.maven.cli.MavenCli;

public class Main {

    public static void main(String[] args) {
        System.setProperty("maven.multiModuleProjectDirectory", ".");
        MavenCli cli = new MavenCli();
        cli.doMain(args, ".", System.out, System.err);
    }

}
