# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SqlAlertArgs', 'SqlAlert']

@pulumi.input_type
class SqlAlertArgs:
    def __init__(__self__, *,
                 options: pulumi.Input['SqlAlertOptionsArgs'],
                 query_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 rearm: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a SqlAlert resource.
        :param pulumi.Input['SqlAlertOptionsArgs'] options: Alert configuration options.
        :param pulumi.Input[str] query_id: ID of the query evaluated by the alert.
        :param pulumi.Input[str] name: Name of the alert.
        :param pulumi.Input[str] parent: The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        :param pulumi.Input[int] rearm: Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        pulumi.set(__self__, "options", options)
        pulumi.set(__self__, "query_id", query_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if rearm is not None:
            pulumi.set(__self__, "rearm", rearm)

    @property
    @pulumi.getter
    def options(self) -> pulumi.Input['SqlAlertOptionsArgs']:
        """
        Alert configuration options.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: pulumi.Input['SqlAlertOptionsArgs']):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter(name="queryId")
    def query_id(self) -> pulumi.Input[str]:
        """
        ID of the query evaluated by the alert.
        """
        return pulumi.get(self, "query_id")

    @query_id.setter
    def query_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "query_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the alert.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)

    @property
    @pulumi.getter
    def rearm(self) -> Optional[pulumi.Input[int]]:
        """
        Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        return pulumi.get(self, "rearm")

    @rearm.setter
    def rearm(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rearm", value)


@pulumi.input_type
class _SqlAlertState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input['SqlAlertOptionsArgs']] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 query_id: Optional[pulumi.Input[str]] = None,
                 rearm: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering SqlAlert resources.
        :param pulumi.Input[str] name: Name of the alert.
        :param pulumi.Input['SqlAlertOptionsArgs'] options: Alert configuration options.
        :param pulumi.Input[str] parent: The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        :param pulumi.Input[str] query_id: ID of the query evaluated by the alert.
        :param pulumi.Input[int] rearm: Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)
        if query_id is not None:
            pulumi.set(__self__, "query_id", query_id)
        if rearm is not None:
            pulumi.set(__self__, "rearm", rearm)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the alert.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input['SqlAlertOptionsArgs']]:
        """
        Alert configuration options.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input['SqlAlertOptionsArgs']]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)

    @property
    @pulumi.getter(name="queryId")
    def query_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the query evaluated by the alert.
        """
        return pulumi.get(self, "query_id")

    @query_id.setter
    def query_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query_id", value)

    @property
    @pulumi.getter
    def rearm(self) -> Optional[pulumi.Input[int]]:
        """
        Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        return pulumi.get(self, "rearm")

    @rearm.setter
    def rearm(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rearm", value)


class SqlAlert(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['SqlAlertOptionsArgs']]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 query_id: Optional[pulumi.Input[str]] = None,
                 rearm: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        This resource allows you to manage [Databricks SQL Alerts](https://docs.databricks.com/sql/user/queries/index.html).

        **Note:** To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your Group or databricks_user.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * SqlQuery to manage Databricks SQL [Queries](https://docs.databricks.com/sql/user/queries/index.html).
        * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
        * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the alert.
        :param pulumi.Input[pulumi.InputType['SqlAlertOptionsArgs']] options: Alert configuration options.
        :param pulumi.Input[str] parent: The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        :param pulumi.Input[str] query_id: ID of the query evaluated by the alert.
        :param pulumi.Input[int] rearm: Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SqlAlertArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage [Databricks SQL Alerts](https://docs.databricks.com/sql/user/queries/index.html).

        **Note:** To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your Group or databricks_user.

        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * SqlQuery to manage Databricks SQL [Queries](https://docs.databricks.com/sql/user/queries/index.html).
        * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
        * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).

        :param str resource_name: The name of the resource.
        :param SqlAlertArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SqlAlertArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[pulumi.InputType['SqlAlertOptionsArgs']]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 query_id: Optional[pulumi.Input[str]] = None,
                 rearm: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SqlAlertArgs.__new__(SqlAlertArgs)

            __props__.__dict__["name"] = name
            if options is None and not opts.urn:
                raise TypeError("Missing required property 'options'")
            __props__.__dict__["options"] = options
            __props__.__dict__["parent"] = parent
            if query_id is None and not opts.urn:
                raise TypeError("Missing required property 'query_id'")
            __props__.__dict__["query_id"] = query_id
            __props__.__dict__["rearm"] = rearm
        super(SqlAlert, __self__).__init__(
            'databricks:index/sqlAlert:SqlAlert',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[pulumi.InputType['SqlAlertOptionsArgs']]] = None,
            parent: Optional[pulumi.Input[str]] = None,
            query_id: Optional[pulumi.Input[str]] = None,
            rearm: Optional[pulumi.Input[int]] = None) -> 'SqlAlert':
        """
        Get an existing SqlAlert resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the alert.
        :param pulumi.Input[pulumi.InputType['SqlAlertOptionsArgs']] options: Alert configuration options.
        :param pulumi.Input[str] parent: The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        :param pulumi.Input[str] query_id: ID of the query evaluated by the alert.
        :param pulumi.Input[int] rearm: Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SqlAlertState.__new__(_SqlAlertState)

        __props__.__dict__["name"] = name
        __props__.__dict__["options"] = options
        __props__.__dict__["parent"] = parent
        __props__.__dict__["query_id"] = query_id
        __props__.__dict__["rearm"] = rearm
        return SqlAlert(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the alert.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output['outputs.SqlAlertOptions']:
        """
        Alert configuration options.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Output[Optional[str]]:
        """
        The identifier of the workspace folder containing the alert. The default is ther user's home folder. The folder identifier is formatted as `folder/<folder_id>`.
        """
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter(name="queryId")
    def query_id(self) -> pulumi.Output[str]:
        """
        ID of the query evaluated by the alert.
        """
        return pulumi.get(self, "query_id")

    @property
    @pulumi.getter
    def rearm(self) -> pulumi.Output[Optional[int]]:
        """
        Number of seconds after being triggered before the alert rearms itself and can be triggered again. If not defined, alert will never be triggered again.
        """
        return pulumi.get(self, "rearm")

