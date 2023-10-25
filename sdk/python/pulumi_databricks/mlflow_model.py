# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MlflowModelArgs', 'MlflowModel']

@pulumi.input_type
class MlflowModelArgs:
    def __init__(__self__, *,
                 creation_timestamp: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MlflowModel resource.
        :param pulumi.Input[str] description: The description of the MLflow model.
        :param pulumi.Input[str] name: Name of MLflow model. Change of name triggers new resource.
        :param pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]] tags: Tags for the MLflow model.
        """
        MlflowModelArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            creation_timestamp=creation_timestamp,
            description=description,
            last_updated_timestamp=last_updated_timestamp,
            name=name,
            tags=tags,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             creation_timestamp: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             last_updated_timestamp: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if creation_timestamp is None and 'creationTimestamp' in kwargs:
            creation_timestamp = kwargs['creationTimestamp']
        if last_updated_timestamp is None and 'lastUpdatedTimestamp' in kwargs:
            last_updated_timestamp = kwargs['lastUpdatedTimestamp']
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']

        if creation_timestamp is not None:
            _setter("creation_timestamp", creation_timestamp)
        if description is not None:
            _setter("description", description)
        if last_updated_timestamp is not None:
            _setter("last_updated_timestamp", last_updated_timestamp)
        if name is not None:
            _setter("name", name)
        if tags is not None:
            _setter("tags", tags)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter(name="creationTimestamp")
    def creation_timestamp(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "creation_timestamp")

    @creation_timestamp.setter
    def creation_timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "creation_timestamp", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the MLflow model.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "last_updated_timestamp")

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "last_updated_timestamp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of MLflow model. Change of name triggers new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]]:
        """
        Tags for the MLflow model.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _MlflowModelState:
    def __init__(__self__, *,
                 creation_timestamp: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 registered_model_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MlflowModel resources.
        :param pulumi.Input[str] description: The description of the MLflow model.
        :param pulumi.Input[str] name: Name of MLflow model. Change of name triggers new resource.
        :param pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]] tags: Tags for the MLflow model.
        """
        _MlflowModelState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            creation_timestamp=creation_timestamp,
            description=description,
            last_updated_timestamp=last_updated_timestamp,
            name=name,
            registered_model_id=registered_model_id,
            tags=tags,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             creation_timestamp: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             last_updated_timestamp: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             registered_model_id: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if creation_timestamp is None and 'creationTimestamp' in kwargs:
            creation_timestamp = kwargs['creationTimestamp']
        if last_updated_timestamp is None and 'lastUpdatedTimestamp' in kwargs:
            last_updated_timestamp = kwargs['lastUpdatedTimestamp']
        if registered_model_id is None and 'registeredModelId' in kwargs:
            registered_model_id = kwargs['registeredModelId']
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']

        if creation_timestamp is not None:
            _setter("creation_timestamp", creation_timestamp)
        if description is not None:
            _setter("description", description)
        if last_updated_timestamp is not None:
            _setter("last_updated_timestamp", last_updated_timestamp)
        if name is not None:
            _setter("name", name)
        if registered_model_id is not None:
            _setter("registered_model_id", registered_model_id)
        if tags is not None:
            _setter("tags", tags)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter(name="creationTimestamp")
    def creation_timestamp(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "creation_timestamp")

    @creation_timestamp.setter
    def creation_timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "creation_timestamp", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the MLflow model.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "last_updated_timestamp")

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "last_updated_timestamp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of MLflow model. Change of name triggers new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="registeredModelId")
    def registered_model_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "registered_model_id")

    @registered_model_id.setter
    def registered_model_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "registered_model_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]]:
        """
        Tags for the MLflow model.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MlflowModelTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class MlflowModel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 creation_timestamp: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MlflowModelTagArgs']]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.

        **Note** This documentation covers the Workspace Model Registry. Databricks recommends using Models in Unity Catalog. Models in Unity Catalog provides centralized model governance, cross-workspace access, lineage, and deployment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        test = databricks.MlflowModel("test",
            description="My MLflow model description",
            tags=[
                databricks.MlflowModelTagArgs(
                    key="key1",
                    value="value1",
                ),
                databricks.MlflowModelTagArgs(
                    key="key2",
                    value="value2",
                ),
            ])
        ```
        ## Access Control

        * Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.

        ## Related Resources

        The following resources are often used in the same context:

        * RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
        * End to end workspace management guide.
        * ModelServing to serve this model on a Databricks serving endpoint.
        * Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        The model resource can be imported using the name bash

        ```sh
         $ pulumi import databricks:index/mlflowModel:MlflowModel this <name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the MLflow model.
        :param pulumi.Input[str] name: Name of MLflow model. Change of name triggers new resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MlflowModelTagArgs']]]] tags: Tags for the MLflow model.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[MlflowModelArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.

        **Note** This documentation covers the Workspace Model Registry. Databricks recommends using Models in Unity Catalog. Models in Unity Catalog provides centralized model governance, cross-workspace access, lineage, and deployment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        test = databricks.MlflowModel("test",
            description="My MLflow model description",
            tags=[
                databricks.MlflowModelTagArgs(
                    key="key1",
                    value="value1",
                ),
                databricks.MlflowModelTagArgs(
                    key="key2",
                    value="value2",
                ),
            ])
        ```
        ## Access Control

        * Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.

        ## Related Resources

        The following resources are often used in the same context:

        * RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
        * End to end workspace management guide.
        * ModelServing to serve this model on a Databricks serving endpoint.
        * Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
        * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
        * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
        * Notebook data to export a notebook from Databricks Workspace.
        * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).

        ## Import

        The model resource can be imported using the name bash

        ```sh
         $ pulumi import databricks:index/mlflowModel:MlflowModel this <name>
        ```

        :param str resource_name: The name of the resource.
        :param MlflowModelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MlflowModelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            MlflowModelArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 creation_timestamp: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MlflowModelTagArgs']]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MlflowModelArgs.__new__(MlflowModelArgs)

            __props__.__dict__["creation_timestamp"] = creation_timestamp
            __props__.__dict__["description"] = description
            __props__.__dict__["last_updated_timestamp"] = last_updated_timestamp
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["registered_model_id"] = None
        super(MlflowModel, __self__).__init__(
            'databricks:index/mlflowModel:MlflowModel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            creation_timestamp: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_updated_timestamp: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            registered_model_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MlflowModelTagArgs']]]]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'MlflowModel':
        """
        Get an existing MlflowModel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the MLflow model.
        :param pulumi.Input[str] name: Name of MLflow model. Change of name triggers new resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MlflowModelTagArgs']]]] tags: Tags for the MLflow model.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MlflowModelState.__new__(_MlflowModelState)

        __props__.__dict__["creation_timestamp"] = creation_timestamp
        __props__.__dict__["description"] = description
        __props__.__dict__["last_updated_timestamp"] = last_updated_timestamp
        __props__.__dict__["name"] = name
        __props__.__dict__["registered_model_id"] = registered_model_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["user_id"] = user_id
        return MlflowModel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="creationTimestamp")
    def creation_timestamp(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "creation_timestamp")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the MLflow model.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "last_updated_timestamp")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of MLflow model. Change of name triggers new resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="registeredModelId")
    def registered_model_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "registered_model_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.MlflowModelTag']]]:
        """
        Tags for the MLflow model.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "user_id")

