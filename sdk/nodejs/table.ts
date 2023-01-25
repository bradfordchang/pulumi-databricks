// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class Table extends pulumi.CustomResource {
    /**
     * Get an existing Table resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableState, opts?: pulumi.CustomResourceOptions): Table {
        return new Table(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/table:Table';

    /**
     * Returns true if the given object is an instance of Table.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Table {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Table.__pulumiType;
    }

    public readonly catalogName!: pulumi.Output<string>;
    public readonly columns!: pulumi.Output<outputs.TableColumn[]>;
    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly dataSourceFormat!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;
    public readonly owner!: pulumi.Output<string>;
    public readonly properties!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly schemaName!: pulumi.Output<string>;
    public readonly storageCredentialName!: pulumi.Output<string | undefined>;
    public readonly storageLocation!: pulumi.Output<string | undefined>;
    public readonly tableType!: pulumi.Output<string>;
    public readonly viewDefinition!: pulumi.Output<string | undefined>;

    /**
     * Create a Table resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableArgs | TableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableState | undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["columns"] = state ? state.columns : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataSourceFormat"] = state ? state.dataSourceFormat : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["storageCredentialName"] = state ? state.storageCredentialName : undefined;
            resourceInputs["storageLocation"] = state ? state.storageLocation : undefined;
            resourceInputs["tableType"] = state ? state.tableType : undefined;
            resourceInputs["viewDefinition"] = state ? state.viewDefinition : undefined;
        } else {
            const args = argsOrState as TableArgs | undefined;
            if ((!args || args.catalogName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catalogName'");
            }
            if ((!args || args.columns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'columns'");
            }
            if ((!args || args.dataSourceFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSourceFormat'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            if ((!args || args.tableType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tableType'");
            }
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["columns"] = args ? args.columns : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataSourceFormat"] = args ? args.dataSourceFormat : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["storageCredentialName"] = args ? args.storageCredentialName : undefined;
            resourceInputs["storageLocation"] = args ? args.storageLocation : undefined;
            resourceInputs["tableType"] = args ? args.tableType : undefined;
            resourceInputs["viewDefinition"] = args ? args.viewDefinition : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Table.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Table resources.
 */
export interface TableState {
    catalogName?: pulumi.Input<string>;
    columns?: pulumi.Input<pulumi.Input<inputs.TableColumn>[]>;
    comment?: pulumi.Input<string>;
    dataSourceFormat?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    owner?: pulumi.Input<string>;
    properties?: pulumi.Input<{[key: string]: any}>;
    schemaName?: pulumi.Input<string>;
    storageCredentialName?: pulumi.Input<string>;
    storageLocation?: pulumi.Input<string>;
    tableType?: pulumi.Input<string>;
    viewDefinition?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    catalogName: pulumi.Input<string>;
    columns: pulumi.Input<pulumi.Input<inputs.TableColumn>[]>;
    comment?: pulumi.Input<string>;
    dataSourceFormat: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    owner?: pulumi.Input<string>;
    properties?: pulumi.Input<{[key: string]: any}>;
    schemaName: pulumi.Input<string>;
    storageCredentialName?: pulumi.Input<string>;
    storageLocation?: pulumi.Input<string>;
    tableType: pulumi.Input<string>;
    viewDefinition?: pulumi.Input<string>;
}
