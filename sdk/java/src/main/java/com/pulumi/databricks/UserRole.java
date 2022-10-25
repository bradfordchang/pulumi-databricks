// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.UserRoleArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.UserRoleState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to attach a role or databricks.InstanceProfile (AWS) to databricks_user.
 * 
 * ## Example Usage
 * 
 * Adding AWS instance profile to a user
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.databricks.UserRole;
 * import com.pulumi.databricks.UserRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var instanceProfile = new InstanceProfile(&#34;instanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .instanceProfileArn(&#34;my_instance_profile_arn&#34;)
 *             .build());
 * 
 *         var myUser = new User(&#34;myUser&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *         var myUserRole = new UserRole(&#34;myUserRole&#34;, UserRoleArgs.builder()        
 *             .userId(myUser.id())
 *             .role(instanceProfile.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Adding user as administrator to Databricks Account
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.User;
 * import com.pulumi.databricks.UserArgs;
 * import com.pulumi.databricks.UserRole;
 * import com.pulumi.databricks.UserRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myUser = new User(&#34;myUser&#34;, UserArgs.builder()        
 *             .userName(&#34;me@example.com&#34;)
 *             .build());
 * 
 *         var myUserAccountAdmin = new UserRole(&#34;myUserAccountAdmin&#34;, UserRoleArgs.builder()        
 *             .userId(myUser.id())
 *             .role(&#34;account_admin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * * databricks.User data to retrieve information about databricks_user.
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/userRole:UserRole")
public class UserRole extends com.pulumi.resources.CustomResource {
    /**
     * Either a role name or the id of the instance profile resource.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Either a role name or the id of the instance profile resource.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * This is the id of the user resource.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return This is the id of the user resource.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserRole(String name) {
        this(name, UserRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserRole(String name, UserRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserRole(String name, UserRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/userRole:UserRole", name, args == null ? UserRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserRole(String name, Output<String> id, @Nullable UserRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/userRole:UserRole", name, state, makeResourceOptions(options, id));
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
    public static UserRole get(String name, Output<String> id, @Nullable UserRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserRole(name, id, state, options);
    }
}
