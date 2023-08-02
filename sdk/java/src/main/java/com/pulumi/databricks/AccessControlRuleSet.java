// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.AccessControlRuleSetArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.AccessControlRuleSetState;
import com.pulumi.databricks.outputs.AccessControlRuleSetGrantRule;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage access rules on Databricks account level resources. For convenience we allow accessing this resource through the Databricks account and workspace.
 * 
 * &gt; **Note** Currently, we only support managing access rules on service principal resources through `databricks.AccessControlRuleSet`.
 * 
 * &gt; **Warning** `databricks.AccessControlRuleSet` cannot be used to manage access rules for resources supported by databricks_permissions. Refer to its documentation for more information.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.Group
 * * databricks.User
 * * databricks.ServicePrincipal
 * 
 */
@ResourceType(type="databricks:index/accessControlRuleSet:AccessControlRuleSet")
public class AccessControlRuleSet extends com.pulumi.resources.CustomResource {
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
     * 
     * !&gt; **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `databricks.AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
     * 
     */
    @Export(name="grantRules", type=List.class, parameters={AccessControlRuleSetGrantRule.class})
    private Output</* @Nullable */ List<AccessControlRuleSetGrantRule>> grantRules;

    /**
     * @return The access control rules to be granted by this rule set, consisting of a set of principals and roles to be granted to them.
     * 
     * !&gt; **Warning** Name uniquely identifies a rule set resource. Ensure all the grant_rules blocks for a rule set name are present in one `databricks.AccessControlRuleSet` resource block. Otherwise, after applying changes, users might lose their role assignment even if that was not intended.
     * 
     */
    public Output<Optional<List<AccessControlRuleSetGrantRule>>> grantRules() {
        return Codegen.optional(this.grantRules);
    }
    /**
     * Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
     * * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique identifier of a rule set. The name determines the resource to which the rule set applies. Currently, only default rule sets are supported. The following rule set formats are supported:
     * * `accounts/{account_id}/servicePrincipals/{service_principal_application_id}/ruleSets/default`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessControlRuleSet(String name) {
        this(name, AccessControlRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessControlRuleSet(String name, @Nullable AccessControlRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessControlRuleSet(String name, @Nullable AccessControlRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, args == null ? AccessControlRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessControlRuleSet(String name, Output<String> id, @Nullable AccessControlRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/accessControlRuleSet:AccessControlRuleSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessControlRuleSet get(String name, Output<String> id, @Nullable AccessControlRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessControlRuleSet(name, id, state, options);
    }
}
