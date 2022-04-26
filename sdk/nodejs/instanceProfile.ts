// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating new `databricks.InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).
 *
 * > **Note** Please switch to databricks.StorageCredential with Unity Catalog to manage storage credentials, which provides better and faster way for managing credential security.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as databricks from "@pulumi/databricks";
 *
 * const config = new pulumi.Config();
 * const crossaccountRoleName = config.require("crossaccountRoleName");
 * const assumeRoleForEc2 = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             identifiers: ["ec2.amazonaws.com"],
 *             type: "Service",
 *         }],
 *     }],
 * });
 * const roleForS3Access = new aws.iam.Role("roleForS3Access", {
 *     description: "Role for shared access",
 *     assumeRolePolicy: assumeRoleForEc2.then(assumeRoleForEc2 => assumeRoleForEc2.json),
 * });
 * const passRoleForS3AccessPolicyDocument = aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["iam:PassRole"],
 *         resources: [roleForS3Access.arn],
 *     }],
 * });
 * const passRoleForS3AccessPolicy = new aws.iam.Policy("passRoleForS3AccessPolicy", {
 *     path: "/",
 *     policy: passRoleForS3AccessPolicyDocument.apply(passRoleForS3AccessPolicyDocument => passRoleForS3AccessPolicyDocument.json),
 * });
 * const crossAccount = new aws.iam.RolePolicyAttachment("crossAccount", {
 *     policyArn: passRoleForS3AccessPolicy.arn,
 *     role: crossaccountRoleName,
 * });
 * const sharedInstanceProfile = new aws.iam.InstanceProfile("sharedInstanceProfile", {role: roleForS3Access.name});
 * const sharedIndex_instanceProfileInstanceProfile = new databricks.InstanceProfile("sharedIndex/instanceProfileInstanceProfile", {instanceProfileArn: sharedInstanceProfile.arn});
 * const latest = databricks.getSparkVersion({});
 * const smallest = databricks.getNodeType({
 *     localDisk: true,
 * });
 * const _this = new databricks.Cluster("this", {
 *     clusterName: "Shared Autoscaling",
 *     sparkVersion: latest.then(latest => latest.id),
 *     nodeTypeId: smallest.then(smallest => smallest.id),
 *     autoterminationMinutes: 20,
 *     autoscale: {
 *         minWorkers: 1,
 *         maxWorkers: 50,
 *     },
 *     awsAttributes: {
 *         instanceProfileArn: sharedIndex / instanceProfileInstanceProfile.id,
 *         availability: "SPOT",
 *         zoneId: "us-east-1",
 *         firstOnDemand: 1,
 *         spotBidPricePercent: 100,
 *     },
 * });
 * ```
 *
 * ## Usage with Cluster Policies
 *
 * It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `databricks.Cluster` above could be replaced with `databricks.ClusterPolicy`:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.ClusterPolicy("this", {definition: JSON.stringify({
 *     "aws_attributes.instance_profile_arn": {
 *         type: "fixed",
 *         value: databricks_instance_profile.shared.arn,
 *     },
 * })});
 * ```
 *
 * ## Granting access to all users
 *
 * You can make instance profile available to all users by associating it with the special group called `users` through databricks.Group data source.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.InstanceProfile("this", {instanceProfileArn: aws_iam_instance_profile.shared.arn});
 * const users = databricks.getGroup({
 *     displayName: "users",
 * });
 * const all = new databricks.GroupInstanceProfile("all", {
 *     groupId: users.then(users => users.id),
 *     instanceProfileId: _this.id,
 * });
 * ```
 *
 * ## Import
 *
 * The resource instance profile can be imported using the ARN of it bash
 *
 * ```sh
 *  $ pulumi import databricks:index/instanceProfile:InstanceProfile this <instance-profile-arn>
 * ```
 */
export class InstanceProfile extends pulumi.CustomResource {
    /**
     * Get an existing InstanceProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceProfileState, opts?: pulumi.CustomResourceOptions): InstanceProfile {
        return new InstanceProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/instanceProfile:InstanceProfile';

    /**
     * Returns true if the given object is an instance of InstanceProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceProfile.__pulumiType;
    }

    /**
     * `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     */
    public readonly instanceProfileArn!: pulumi.Output<string | undefined>;
    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     */
    public readonly isMetaInstanceProfile!: pulumi.Output<boolean | undefined>;
    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. “Your requested instance type is not supported in your requested availability zone”), you can pass this flag to skip the validation and forcibly add the instance profile.
     */
    public readonly skipValidation!: pulumi.Output<boolean>;

    /**
     * Create a InstanceProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: InstanceProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceProfileArgs | InstanceProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceProfileState | undefined;
            resourceInputs["instanceProfileArn"] = state ? state.instanceProfileArn : undefined;
            resourceInputs["isMetaInstanceProfile"] = state ? state.isMetaInstanceProfile : undefined;
            resourceInputs["skipValidation"] = state ? state.skipValidation : undefined;
        } else {
            const args = argsOrState as InstanceProfileArgs | undefined;
            resourceInputs["instanceProfileArn"] = args ? args.instanceProfileArn : undefined;
            resourceInputs["isMetaInstanceProfile"] = args ? args.isMetaInstanceProfile : undefined;
            resourceInputs["skipValidation"] = args ? args.skipValidation : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceProfile resources.
 */
export interface InstanceProfileState {
    /**
     * `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     */
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     */
    isMetaInstanceProfile?: pulumi.Input<boolean>;
    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. “Your requested instance type is not supported in your requested availability zone”), you can pass this flag to skip the validation and forcibly add the instance profile.
     */
    skipValidation?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a InstanceProfile resource.
 */
export interface InstanceProfileArgs {
    /**
     * `ARN` attribute of `awsIamInstanceProfile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     */
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     */
    isMetaInstanceProfile?: pulumi.Input<boolean>;
    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. “Your requested instance type is not supported in your requested availability zone”), you can pass this flag to skip the validation and forcibly add the instance profile.
     */
    skipValidation?: pulumi.Input<boolean>;
}