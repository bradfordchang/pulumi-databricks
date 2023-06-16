// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.StorageCredentialArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.StorageCredentialState;
import com.pulumi.databricks.outputs.StorageCredentialAwsIamRole;
import com.pulumi.databricks.outputs.StorageCredentialAzureManagedIdentity;
import com.pulumi.databricks.outputs.StorageCredentialAzureServicePrincipal;
import com.pulumi.databricks.outputs.StorageCredentialDatabricksGcpServiceAccount;
import com.pulumi.databricks.outputs.StorageCredentialGcpServiceAccountKey;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
 * 
 * - `databricks.StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
 * - databricks.ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
 * 
 * ## Example Usage
 * 
 * For AWS
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialAwsIamRoleArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var external = new StorageCredential(&#34;external&#34;, StorageCredentialArgs.builder()        
 *             .awsIamRole(StorageCredentialAwsIamRoleArgs.builder()
 *                 .roleArn(aws_iam_role.external_data_access().arn())
 *                 .build())
 *             .comment(&#34;Managed by TF&#34;)
 *             .build());
 * 
 *         var externalCreds = new Grants(&#34;externalCreds&#34;, GrantsArgs.builder()        
 *             .storageCredential(external.id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal(&#34;Data Engineers&#34;)
 *                 .privileges(&#34;CREATE_TABLE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * For Azure
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialAzureManagedIdentityArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var externalMi = new StorageCredential(&#34;externalMi&#34;, StorageCredentialArgs.builder()        
 *             .azureManagedIdentity(StorageCredentialAzureManagedIdentityArgs.builder()
 *                 .accessConnectorId(azurerm_databricks_access_connector.example().id())
 *                 .build())
 *             .comment(&#34;Managed identity credential managed by TF&#34;)
 *             .build());
 * 
 *         var externalCreds = new Grants(&#34;externalCreds&#34;, GrantsArgs.builder()        
 *             .storageCredential(databricks_storage_credential.external().id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal(&#34;Data Engineers&#34;)
 *                 .privileges(&#34;CREATE_TABLE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * For GCP
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialDatabricksGcpServiceAccountArgs;
 * import com.pulumi.databricks.Grants;
 * import com.pulumi.databricks.GrantsArgs;
 * import com.pulumi.databricks.inputs.GrantsGrantArgs;
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
 *         var external = new StorageCredential(&#34;external&#34;, StorageCredentialArgs.builder()        
 *             .databricksGcpServiceAccount()
 *             .build());
 * 
 *         var externalCreds = new Grants(&#34;externalCreds&#34;, GrantsArgs.builder()        
 *             .storageCredential(external.id())
 *             .grants(GrantsGrantArgs.builder()
 *                 .principal(&#34;Data Engineers&#34;)
 *                 .privileges(&#34;CREATE_TABLE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by namebash
 * 
 * ```sh
 *  $ pulumi import databricks:index/storageCredential:StorageCredential this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/storageCredential:StorageCredential")
public class StorageCredential extends com.pulumi.resources.CustomResource {
    @Export(name="awsIamRole", type=StorageCredentialAwsIamRole.class, parameters={})
    private Output</* @Nullable */ StorageCredentialAwsIamRole> awsIamRole;

    public Output<Optional<StorageCredentialAwsIamRole>> awsIamRole() {
        return Codegen.optional(this.awsIamRole);
    }
    @Export(name="azureManagedIdentity", type=StorageCredentialAzureManagedIdentity.class, parameters={})
    private Output</* @Nullable */ StorageCredentialAzureManagedIdentity> azureManagedIdentity;

    public Output<Optional<StorageCredentialAzureManagedIdentity>> azureManagedIdentity() {
        return Codegen.optional(this.azureManagedIdentity);
    }
    @Export(name="azureServicePrincipal", type=StorageCredentialAzureServicePrincipal.class, parameters={})
    private Output</* @Nullable */ StorageCredentialAzureServicePrincipal> azureServicePrincipal;

    public Output<Optional<StorageCredentialAzureServicePrincipal>> azureServicePrincipal() {
        return Codegen.optional(this.azureServicePrincipal);
    }
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="databricksGcpServiceAccount", type=StorageCredentialDatabricksGcpServiceAccount.class, parameters={})
    private Output<StorageCredentialDatabricksGcpServiceAccount> databricksGcpServiceAccount;

    public Output<StorageCredentialDatabricksGcpServiceAccount> databricksGcpServiceAccount() {
        return this.databricksGcpServiceAccount;
    }
    @Export(name="gcpServiceAccountKey", type=StorageCredentialGcpServiceAccountKey.class, parameters={})
    private Output</* @Nullable */ StorageCredentialGcpServiceAccountKey> gcpServiceAccountKey;

    public Output<Optional<StorageCredentialGcpServiceAccountKey>> gcpServiceAccountKey() {
        return Codegen.optional(this.gcpServiceAccountKey);
    }
    @Export(name="metastoreId", type=String.class, parameters={})
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the storage credential owner.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the storage credential owner.
     * 
     * `aws_iam_role` optional configuration block for credential details for AWS:
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Indicates whether the storage credential is only usable for read operations.
     * 
     */
    @Export(name="readOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> readOnly;

    /**
     * @return Indicates whether the storage credential is only usable for read operations.
     * 
     */
    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageCredential(String name) {
        this(name, StorageCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageCredential(String name, @Nullable StorageCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageCredential(String name, @Nullable StorageCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/storageCredential:StorageCredential", name, args == null ? StorageCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StorageCredential(String name, Output<String> id, @Nullable StorageCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/storageCredential:StorageCredential", name, state, makeResourceOptions(options, id));
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
    public static StorageCredential get(String name, Output<String> id, @Nullable StorageCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StorageCredential(name, id, state, options);
    }
}
