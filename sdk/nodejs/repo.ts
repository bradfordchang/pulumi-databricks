// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource Repo can be imported using the Repo ID (obtained via UI or using API) bash
 *
 * ```sh
 *  $ pulumi import databricks:index/repo:Repo this repo_id
 * ```
 */
export class Repo extends pulumi.CustomResource {
    /**
     * Get an existing Repo resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RepoState, opts?: pulumi.CustomResourceOptions): Repo {
        return new Repo(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/repo:Repo';

    /**
     * Returns true if the given object is an instance of Repo.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Repo {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Repo.__pulumiType;
    }

    /**
     * name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
     */
    public readonly branch!: pulumi.Output<string>;
    /**
     * Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
     */
    public readonly commitHash!: pulumi.Output<string>;
    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
     */
    public readonly gitProvider!: pulumi.Output<string>;
    /**
     * path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
     */
    public readonly path!: pulumi.Output<string>;
    public readonly sparseCheckout!: pulumi.Output<outputs.RepoSparseCheckout | undefined>;
    /**
     * name of the tag for initial checkout.  Conflicts with `branch`.
     */
    public readonly tag!: pulumi.Output<string | undefined>;
    /**
     * The URL of the Git Repository to clone from. If the value changes, repo is re-created.
     */
    public readonly url!: pulumi.Output<string>;

    /**
     * Create a Repo resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RepoArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RepoArgs | RepoState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RepoState | undefined;
            resourceInputs["branch"] = state ? state.branch : undefined;
            resourceInputs["commitHash"] = state ? state.commitHash : undefined;
            resourceInputs["gitProvider"] = state ? state.gitProvider : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["sparseCheckout"] = state ? state.sparseCheckout : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as RepoArgs | undefined;
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["branch"] = args ? args.branch : undefined;
            resourceInputs["commitHash"] = args ? args.commitHash : undefined;
            resourceInputs["gitProvider"] = args ? args.gitProvider : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["sparseCheckout"] = args ? args.sparseCheckout : undefined;
            resourceInputs["tag"] = args ? args.tag : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Repo.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Repo resources.
 */
export interface RepoState {
    /**
     * name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
     */
    branch?: pulumi.Input<string>;
    /**
     * Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
     */
    commitHash?: pulumi.Input<string>;
    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
     */
    gitProvider?: pulumi.Input<string>;
    /**
     * path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
     */
    path?: pulumi.Input<string>;
    sparseCheckout?: pulumi.Input<inputs.RepoSparseCheckout>;
    /**
     * name of the tag for initial checkout.  Conflicts with `branch`.
     */
    tag?: pulumi.Input<string>;
    /**
     * The URL of the Git Repository to clone from. If the value changes, repo is re-created.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Repo resource.
 */
export interface RepoArgs {
    /**
     * name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
     */
    branch?: pulumi.Input<string>;
    /**
     * Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
     */
    commitHash?: pulumi.Input<string>;
    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
     */
    gitProvider?: pulumi.Input<string>;
    /**
     * path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
     */
    path?: pulumi.Input<string>;
    sparseCheckout?: pulumi.Input<inputs.RepoSparseCheckout>;
    /**
     * name of the tag for initial checkout.  Conflicts with `branch`.
     */
    tag?: pulumi.Input<string>;
    /**
     * The URL of the Git Repository to clone from. If the value changes, repo is re-created.
     */
    url: pulumi.Input<string>;
}
