public class Test {

  public static void main(String[] args) throws Exception {
    String input = "routing-policy/defined-sets/bgp-defined-sets/as-path-sets/as-path-set/config\n"
        + "routing-policy/defined-sets/bgp-defined-sets/community-sets/community-set/config\n"
        + "routing-policy/defined-sets/bgp-defined-sets/ext-community-sets/ext-community-set/config\n"
        + "routing-policy/defined-sets/neighbor-sets/neighbor-set/config\n"
        + "routing-policy/defined-sets/prefix-sets/prefix-set/config\n"
        + "routing-policy/defined-sets/prefix-sets/prefix-set/prefixes/prefix/config\n"
        + "routing-policy/defined-sets/tag-sets/tag-set/config\n"
        + "routing-policy/policy-definitions/policy-definition/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-as-path-prepend/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/inline/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-community/reference/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/inline/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/bgp-actions/set-ext-community/reference/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/ospf-actions/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/actions/ospf-actions/set-metric/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/as-path-length/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/community-count/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/bgp-conditions/match-as-path-set/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-interface/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-neighbor-set/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-prefix-set/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/match-tag-set/config\n"
        + "routing-policy/policy-definitions/policy-definition/statements/statement/conditions/ospf-conditions/config";
    String[] inputArray = input.split("\n");
    for(int i = 0;i<inputArray.length;i++) {
      System.out.println(i+ ". " + inputArray[i]);
    }
    System.out.println(inputArray.length);
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < inputArray.length; i++) {
      output.append("getRequest = GetRequest.newBuilder()\n"
              + "        .addPath(PathConverter.xPath2Path(\"").append(inputArray[i]).append("\"))\n")
          .append("        .build();\n")
          .append("    list.add(new SwitchCmd(\"gNMI\", getRequest));");
      output.append("\n");
      output.append("\n");
    }
    System.out.println("output = " + output);
  }

}
