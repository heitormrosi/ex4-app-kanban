package dev.hmr.kanban.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hmr.kanban.R
import dev.hmr.kanban.databinding.FragmentSplashBinding
import dev.hmr.kanban.databinding.FragmentTodoBinding


class TodoFragment : Fragment() {
    private var _binding: FragmentTodoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this._binding = FragmentTodoBinding.inflate(
            inflater,
            container,
            false
        )
        return this.binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this._binding = null
    }
}